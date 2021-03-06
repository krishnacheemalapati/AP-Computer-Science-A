//********************************************************************
// OutOfRangeException.java Author: Lewis/Loftus
//
// Represents an exceptional condition in which a value is out of
// some particular range.
//********************************************************************
public class InvalidDocumentCodeException extends Exception
{
//-----------------------------------------------------------------
// Sets up the exception object with a particular message.
//-----------------------------------------------------------------
  InvalidDocumentCodeException()
  {
    super("Oops. This document code is invalid!");
  }
}