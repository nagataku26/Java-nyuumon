import java.util.*;

public class Book implements Comparable<Book>, Cloneable  {
  private String title;
  private Date publishDate;
  private String comment;

  public int hashCode() {
    return Objects.hash(this.title,this.publishDate,this.comment);
  }
  public boolean epuals(Object o) {
    if (o == this ) {
      return true;
    }
    if (o == null) {
      return false;
    }
    if (!(o instanceof Book)) {
      return false;
    }
    Book b = (Book)o;
    if (!publishDate.equals(b.publishDate)) {
      return false;
    }
    if (!title.equals(b.title)) {
      return false;
    }
    return true;
  }
  public int compareTo(Book o) {
    return this.publishDate.compareTo(o.publishDate);
  }
  public Book clone() {
    Book b = new Book();
    b.title = this.title;
    b.publishDate = (Date)this.publishDate.clone();
    b.comment = this.comment;
    return b;
  }


  public String getTitle() {
    return this.title;
  }
  public void setTitle(String title) {
    this.title = title;
  }
  public Date getPublishDate() {
    return this.publishDate;
  }
  public void setPublishDate(Date publishDate) {
    this.publishDate = publishDate;
  }
  public String getComment() {
    return this.comment;
  }
  public void setComment(String comment) {
    this.comment = comment;
  }
  
}