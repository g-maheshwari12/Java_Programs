import java.util.*;
public class Invoice
{
	public static String formatId(String oldId)
	{
		return oldId + "_Invoice";
	}
}
public class SalesInvoice extends Invoice
{
	public static String formatId(String oldId)
	{
		return oldId + "_SalesInvoice";
	}
}