package mediator;

/**
 * Abstract Mediator
 */
public interface Mediator {

    void book();

    void view();

    void search();

    void registerView(ViewButton viewButton);

    void registerSearch(SearchButton searchButton);

    void registerBook(BookButton bookButton);

    void registerDisplay(Display display);

}
