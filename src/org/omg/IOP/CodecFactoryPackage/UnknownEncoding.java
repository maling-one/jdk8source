package org.omg.IOP.CodecFactoryPackage;


/**
* org/omg/IOP/CodecFactoryPackage/UnknownEncoding.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from c:/jenkins/workspace/zulu-platform-build/zulu-src.git/corba/src/share/classes/org/omg/PortableInterceptor/IOP.idl
* Sunday, October 9, 2022 9:42:32 AM UTC
*/

public final class UnknownEncoding extends org.omg.CORBA.UserException
{

  public UnknownEncoding ()
  {
    super(UnknownEncodingHelper.id());
  } // ctor


  public UnknownEncoding (String $reason)
  {
    super(UnknownEncodingHelper.id() + "  " + $reason);
  } // ctor

} // class UnknownEncoding
