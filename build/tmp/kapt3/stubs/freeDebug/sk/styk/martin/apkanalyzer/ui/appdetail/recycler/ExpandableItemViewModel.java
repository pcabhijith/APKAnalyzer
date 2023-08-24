package sk.styk.martin.apkanalyzer.ui.appdetail.recycler;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0003H&R\u0012\u0010\u0002\u001a\u00020\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005\u00a8\u0006\t"}, d2 = {"Lsk/styk/martin/apkanalyzer/ui/appdetail/recycler/ExpandableItemViewModel;", "", "expanded", "", "getExpanded", "()Z", "toggleExpanded", "", "newlyExpanded", "app_freeDebug"})
public abstract interface ExpandableItemViewModel {
    
    public abstract boolean getExpanded();
    
    public abstract void toggleExpanded(boolean newlyExpanded);
}