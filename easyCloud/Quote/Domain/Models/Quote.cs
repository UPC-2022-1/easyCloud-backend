namespace easyCloud.Quote.Domain.Models;

public class Quote
{
    public int Id { get; set; }
    public string Description { get; set; }
    public string Title { get; set; }
    public DateTime Date { get; set; }
    public int Price { get; set; }
}