namespace Shared.Exceptions;

public class EanTakenException : Exception
{
    public EanTakenException()
    { }

    public EanTakenException(string message)
        : base(message)
    { }

    public EanTakenException(string message, Exception inner)
        : base(message, inner)
    {
    }
}