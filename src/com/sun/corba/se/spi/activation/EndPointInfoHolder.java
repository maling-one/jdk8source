package com.sun.corba.se.spi.activation;

/**
* com/sun/corba/se/spi/activation/EndPointInfoHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from c:/jenkins/workspace/zulu-platform-build/zulu-src.git/corba/src/share/classes/com/sun/corba/se/spi/activation/activation.idl
* Sunday, October 9, 2022 9:42:31 AM UTC
*/

public final class EndPointInfoHolder implements org.omg.CORBA.portable.Streamable
{
  public com.sun.corba.se.spi.activation.EndPointInfo value = null;

  public EndPointInfoHolder ()
  {
  }

  public EndPointInfoHolder (com.sun.corba.se.spi.activation.EndPointInfo initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = com.sun.corba.se.spi.activation.EndPointInfoHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    com.sun.corba.se.spi.activation.EndPointInfoHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return com.sun.corba.se.spi.activation.EndPointInfoHelper.type ();
  }

}
