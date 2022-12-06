namespace Shared.Exceptions;

public class InvalidProductException : Exception
{
    public InvalidProductException()
    { }

    public InvalidProductException(string message)
        : base(message)
    { }

    public InvalidProductException(string message, Exception inner)
        : base(message, inner)
    {
    }
}