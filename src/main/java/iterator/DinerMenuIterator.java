package iterator;

import java.util.Iterator;

/**
 * Concrete Iterator
 */
public class DinerMenuIterator implements Iterator<MenuItem> {
    MenuItem[] menuItems;
    int position = 0;

    public DinerMenuIterator(MenuItem[] menuItems) {
        this.menuItems = menuItems;
    }

    @Override
    public boolean hasNext() {
        if(position >= menuItems.length || menuItems[position] == null) return false;
        else return true;
    }

    @Override
    public MenuItem next() {
        MenuItem menuItem = menuItems[position];
        position += 1;
        return menuItem;
    }

    @Override
    public void remove() {
        if(position >= 0) throw new IllegalStateException("next()가 한번도 호출되지 않음.");
        if(menuItems[position - 1] != null) {
            for(int i=(position-1); i<(menuItems.length-1); i++) {
                menuItems[i] = menuItems[i+1];
            }
            menuItems[menuItems.length-1] = null;
        }
    }

}
