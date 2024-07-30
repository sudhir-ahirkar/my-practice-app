package com.test.application;

import java.util.Hashtable;

import javax.naming.Context;
import javax.naming.NamingEnumeration;
import javax.naming.NamingException;
import javax.naming.directory.Attribute;
import javax.naming.directory.Attributes;
import javax.naming.directory.BasicAttribute;
import javax.naming.directory.BasicAttributes;
import javax.naming.directory.DirContext;
import javax.naming.directory.InitialDirContext;
import javax.naming.directory.SearchControls;
import javax.naming.directory.SearchResult;
//http://java2db.com/jndi-ldap-programming/add-new-entry-to-ldap-using-java-jndi
//https://www.javaworld.com/article/2077729/simplify-directory-access-with-spring-ldap.html
public class SimpleLDAPClient {
  static DirContext ctx = null;
  public static void main(String[] args) {
      Hashtable env = new Hashtable();

      env.put(Context.INITIAL_CONTEXT_FACTORY,"com.sun.jndi.ldap.LdapCtxFactory");
      env.put(Context.PROVIDER_URL, "ldap://localhost:10389/ou=system");
      env.put(Context.SECURITY_AUTHENTICATION, "simple");
      env.put(Context.SECURITY_PRINCIPAL, "uid=admin,ou=system");
      env.put(Context.SECURITY_CREDENTIALS, "secret");
     
      NamingEnumeration results = null;
      try {
          ctx = new InitialDirContext(env);
          SearchControls controls = new SearchControls();
          controls.setSearchScope(SearchControls.SUBTREE_SCOPE);
          results = ctx.search("", "(objectclass=person)", controls);
          while (results.hasMore()) {
              SearchResult searchResult = (SearchResult) results.next();
              Attributes attributes = searchResult.getAttributes();
              Attribute attr = attributes.get("cn");
              String cn = (String) attr.get();
              
              Attribute attrUid = attributes.get("uid");
              String uid = (String) attrUid.get();
              
              Attribute attrSn = attributes.get("sn");
              String sn = (String) attrSn.get();
              System.out.println(" Person Common Name = cn " + cn +" Uid="+uid+ " sn="+sn);
              
              addEntry("myfirstuser");
          }
      } catch (NamingException e) {
          throw new RuntimeException(e);
      } finally {
//          if (results != null) {
//              try {
//                  results.close();
//              } catch (Exception e) {
//              }
//          }
//          if (ctx != null) {
//              try {
//                  ctx.close();
//              } catch (Exception e) {
//              }
//          }
      }
  }
  
//Attributes to be set for new entry creation
  public static boolean addEntry(String userId)
  {
  boolean flag = false;
  Attribute userCn = new BasicAttribute("cn", "testUser");
  Attribute userSn = new BasicAttribute("sn", "testUser");
//  Attribute userMail = new BasicAttribute("mail", "test@xxxx.com");
//  Attribute userPhone = new BasicAttribute("Mobile", "0100000000");
//  Attribute userGivename = new BasicAttribute("givenname", "testUser");
//  Attribute userTitle = new BasicAttribute("PersonalTitle", "user for test");
//  Attribute userUserPassword = new BasicAttribute("userPassword","password");
//  Attribute userstatus = new BasicAttribute("userstatus","A");
  //ObjectClass attributes
  Attribute oc = new BasicAttribute("objectClass");
  oc.add("person");
  oc.add("publicuser");
  oc.add("inetOrgPerson");

  Attributes entry = new BasicAttributes();
  entry.put(userCn);
  entry.put(userSn);
//  entry.put(userMail);
//  entry.put(userPhone);
//  entry.put(userGivename);
//  entry.put(userTitle);
//  entry.put(userUserPassword);
  entry.put(oc);
//  entry.put(userstatus);
  //uid=142,ou=alzebra,dc=mathsdep,dc=college
//  String entryDN = "uid="+userId.trim()+",ou=alzebra,dc=mathsdep,dc=college,dc=org,dc=in";
//  String entryDN = "uid="+userId.trim()+",ou=system,dc=example,dc=com";
  String entryDN = "uid="+userId.trim()+",ou=system";

  System.out.println("entryDN :" + entryDN);
  try{
    ctx.createSubcontext(entryDN, entry);
      flag = true;
  }catch(Exception e){
      System.out.println("error: " + e.getMessage());
      return flag;
      }
  return flag ;
  }

}