package com.sun.corba.se.PortableActivationIDL;


/**
* com/sun/corba/se/PortableActivationIDL/BadServerDefinition.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from c:/jenkins/workspace/zulu-platform-build/zulu-src.git/corba/src/share/classes/com/sun/corba/se/PortableActivationIDL/activation.idl
* Sunday, October 9, 2022 9:42:31 AM UTC
*/

public final class BadServerDefinition extends org.omg.CORBA.UserException
{
  public String reason = null;

  public BadServerDefinition ()
  {
    super(BadServerDefinitionHelper.id());
  } // ctor

  public BadServerDefinition (String _reason)
  {
    super(BadServerDefinitionHelper.id());
    reason = _reason;
  } // ctor


  public BadServerDefinition (String $reason, String _reason)
  {
    super(BadServerDefinitionHelper.id() + "  " + $reason);
    reason = _reason;
  } // ctor

} // class BadServerDefinition
