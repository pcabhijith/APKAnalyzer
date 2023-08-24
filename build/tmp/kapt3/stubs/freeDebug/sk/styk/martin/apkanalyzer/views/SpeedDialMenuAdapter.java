package sk.styk.martin.apkanalyzer.views;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b&\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016J\u001f\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\tH\u0017\u00a2\u0006\u0002\u0010\nJ\b\u0010\u000b\u001a\u00020\u0006H&J\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u0007\u001a\u00020\u0006H&J\b\u0010\u000e\u001a\u00020\u000fH\u0016J\u0010\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J \u0010\u0011\u001a\u00020\u00122\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u0014H\u0016J \u0010\u0015\u001a\u00020\u00122\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u0017H\u0016J \u0010\u0018\u001a\u00020\u00122\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u0019H\u0016\u00a8\u0006\u001a"}, d2 = {"Lsk/styk/martin/apkanalyzer/views/SpeedDialMenuAdapter;", "", "()V", "fabRotationDegrees", "", "getBackgroundColour", "", "position", "context", "Landroid/content/Context;", "(ILandroid/content/Context;)Ljava/lang/Integer;", "getCount", "getMenuItem", "Lsk/styk/martin/apkanalyzer/views/SpeedDialMenuItem;", "isEnabled", "", "onMenuItemClick", "onPrepareItemCard", "", "card", "Landroid/view/View;", "onPrepareItemIconWrapper", "label", "Landroid/widget/LinearLayout;", "onPrepareItemLabel", "Landroid/widget/TextView;", "app_freeDebug"})
public abstract class SpeedDialMenuAdapter {
    
    public SpeedDialMenuAdapter() {
        super();
    }
    
    /**
     * Gets the number of items represented by this adapter.
     * Note: returning zero has the same effect as return `false` from `isEnabled()`.
     * @return the number of items represented by this adapter
     */
    public abstract int getCount();
    
    /**
     * Gets the menu item to display at the specified position in the range 0 to `getCount() - 1`.
     * See `SpeedDialMenuItem` for more details.
     * Note: positions start at zero closest to the FAB and increase for items further away.
     * @return the menu item to display at the specified position
     */
    @org.jetbrains.annotations.NotNull
    public abstract sk.styk.martin.apkanalyzer.views.SpeedDialMenuItem getMenuItem(int position);
    
    /**
     * Handler for click events on menu items.
     * The position passed corresponds to positions passed to `getMenuItem()`.
     * @return `true` to close the menu after the click; `false` to leave it open
     */
    public boolean onMenuItemClick(int position) {
        return false;
    }
    
    /**
     * Gets the colour of the background tile behind the menu item.
     * Positions correspond to positions passed to `getMenuItem()`.
     * Note: this method should return an aRGB colour integer, *not* a colour resource ID.
     * @return the colour of the card behind the icon at the specified position
     */
    @androidx.annotation.ColorInt
    @org.jetbrains.annotations.Nullable
    public java.lang.Integer getBackgroundColour(int position, @org.jetbrains.annotations.NotNull
    android.content.Context context) {
        return null;
    }
    
    /**
     * Apply formatting to the `TextView` used for the label of the menu item at the given position.
     * Note: positions start at zero closest to the FAB and increase for items further away.
     */
    public void onPrepareItemLabel(@org.jetbrains.annotations.NotNull
    android.content.Context context, int position, @org.jetbrains.annotations.NotNull
    android.widget.TextView label) {
    }
    
    /**
     * Apply formatting to the view used for the card behind the icon at the given position.
     * Note: the view will be a `CardView` on SDK 21+ and a `LinearLayout` on SDK 20 and below.
     * Note: positions start at zero closest to the FAB and increase for items further away.
     */
    public void onPrepareItemCard(@org.jetbrains.annotations.NotNull
    android.content.Context context, int position, @org.jetbrains.annotations.NotNull
    android.view.View card) {
    }
    
    /**
     * Apply formatting to the `LinearLayout` that wraps the icon of the menu item at the given position.
     * This is called after the icon is set as the background of the given wrapper.
     * Note: positions start at zero closest to the FAB and increase for items further away.
     */
    public void onPrepareItemIconWrapper(@org.jetbrains.annotations.NotNull
    android.content.Context context, int position, @org.jetbrains.annotations.NotNull
    android.widget.LinearLayout label) {
    }
    
    /**
     * Gets the number of degrees to rotate the FAB's icon when the speed-dial menu opens.
     * This is useful for the popular "plus icon"/"close icon" transition.
     * @return the number of degrees to rotate the FAB's icon when the speed-dial menu opens
     */
    public float fabRotationDegrees() {
        return 0.0F;
    }
    
    /**
     * Determines whether or not the speed-dial menu is enabled.
     * @return `true` if the menu is enabled; `false` if it is not
     */
    public boolean isEnabled() {
        return false;
    }
}