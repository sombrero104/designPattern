package mediator;

/**
 * Concrete Mediator
 */
public class ParticipantMediator implements Mediator {
    ViewButton viewButton;
    SearchButton searchButton;
    BookButton bookButton;
    Display display;

    @Override
    public void registerView(ViewButton viewButton) {
        this.viewButton = viewButton;
    }

    @Override
    public void registerSearch(SearchButton searchButton) {
        this.searchButton = searchButton;
    }

    @Override
    public void registerBook(BookButton bookButton) {
        this.bookButton = bookButton;
    }

    @Override
    public void registerDisplay(Display display) {
        this.display = display;
    }

    @Override
    public void view() {
        viewButton.setEnabled(false);
        searchButton.setEnabled(true);
        bookButton.setEnabled(true);
        display.setText("Viewing..");
    }

    @Override
    public void search() {
        viewButton.setEnabled(true);
        searchButton.setEnabled(false);
        bookButton.setEnabled(true);
        display.setText("Searching..");
    }

    @Override
    public void book() {
        viewButton.setEnabled(true);
        searchButton.setEnabled(true);
        bookButton.setEnabled(false);
        display.setText("Booking..");
    }

}
