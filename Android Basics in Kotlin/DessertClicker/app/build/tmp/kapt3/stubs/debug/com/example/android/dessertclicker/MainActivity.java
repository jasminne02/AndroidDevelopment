package com.example.android.dessertclicker;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u00002\u00020\u0001:\u0001*B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0012\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0014J\u0010\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001bH\u0016J\b\u0010\u001c\u001a\u00020\u0015H\u0002J\b\u0010\u001d\u001a\u00020\u0015H\u0014J\u0010\u0010\u001e\u001a\u00020\u00192\u0006\u0010\u001f\u001a\u00020 H\u0016J\b\u0010!\u001a\u00020\u0015H\u0014J\b\u0010\"\u001a\u00020\u0015H\u0014J\b\u0010#\u001a\u00020\u0015H\u0014J\u0010\u0010$\u001a\u00020\u00152\u0006\u0010%\u001a\u00020\u0017H\u0014J\b\u0010&\u001a\u00020\u0015H\u0002J\b\u0010\'\u001a\u00020\u0015H\u0014J\b\u0010(\u001a\u00020\u0015H\u0014J\b\u0010)\u001a\u00020\u0015H\u0002R\u0014\u0010\u0003\u001a\u00020\u0004X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u0004X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u0004X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u0006R\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\rX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0012X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006+"}, d2 = {"Lcom/example/android/dessertclicker/MainActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "()V", "KEY_DESSERT_SOLD", "", "getKEY_DESSERT_SOLD", "()Ljava/lang/String;", "KEY_REVENUE", "getKEY_REVENUE", "TAG", "getTAG", "allDesserts", "", "Lcom/example/android/dessertclicker/MainActivity$Dessert;", "binding", "Lcom/example/android/dessertclicker/databinding/ActivityMainBinding;", "currentDessert", "dessertsSold", "", "revenue", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onCreateOptionsMenu", "", "menu", "Landroid/view/Menu;", "onDessertClicked", "onDestroy", "onOptionsItemSelected", "item", "Landroid/view/MenuItem;", "onPause", "onRestart", "onResume", "onSaveInstanceState", "outState", "onShare", "onStart", "onStop", "showCurrentDessert", "Dessert", "app_debug"})
public final class MainActivity extends androidx.appcompat.app.AppCompatActivity {
    private int revenue = 0;
    private int dessertsSold = 0;
    private com.example.android.dessertclicker.databinding.ActivityMainBinding binding;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String TAG = "MainActivity";
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String KEY_REVENUE = "revenue_key";
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String KEY_DESSERT_SOLD = "dessert_sold_key";
    private final java.util.List<com.example.android.dessertclicker.MainActivity.Dessert> allDesserts = null;
    private com.example.android.dessertclicker.MainActivity.Dessert currentDessert;
    
    public MainActivity() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getTAG() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getKEY_REVENUE() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getKEY_DESSERT_SOLD() {
        return null;
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    /**
     * Updates the score when the dessert is clicked. Possibly shows a new dessert.
     */
    private final void onDessertClicked() {
    }
    
    /**
     * Determine which dessert to show.
     */
    private final void showCurrentDessert() {
    }
    
    /**
     * Menu methods
     */
    private final void onShare() {
    }
    
    @java.lang.Override()
    public boolean onCreateOptionsMenu(@org.jetbrains.annotations.NotNull()
    android.view.Menu menu) {
        return false;
    }
    
    @java.lang.Override()
    public boolean onOptionsItemSelected(@org.jetbrains.annotations.NotNull()
    android.view.MenuItem item) {
        return false;
    }
    
    @java.lang.Override()
    protected void onSaveInstanceState(@org.jetbrains.annotations.NotNull()
    android.os.Bundle outState) {
    }
    
    @java.lang.Override()
    protected void onStart() {
    }
    
    @java.lang.Override()
    protected void onResume() {
    }
    
    @java.lang.Override()
    protected void onPause() {
    }
    
    @java.lang.Override()
    protected void onStop() {
    }
    
    @java.lang.Override()
    protected void onDestroy() {
    }
    
    @java.lang.Override()
    protected void onRestart() {
    }
    
    /**
     * Simple data class that represents a dessert. Includes the resource id integer associated with
     * the image, the price it's sold for, and the startProductionAmount, which determines when
     * the dessert starts to be produced.
     */
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\f\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\r\u001a\u00020\u0003H\u00c6\u0003J\'\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0012\u001a\u00020\u0003H\u00d6\u0001J\t\u0010\u0013\u001a\u00020\u0014H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bR\u0011\u0010\u0005\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\b\u00a8\u0006\u0015"}, d2 = {"Lcom/example/android/dessertclicker/MainActivity$Dessert;", "", "imageId", "", "price", "startProductionAmount", "(III)V", "getImageId", "()I", "getPrice", "getStartProductionAmount", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "", "app_debug"})
    public static final class Dessert {
        private final int imageId = 0;
        private final int price = 0;
        private final int startProductionAmount = 0;
        
        /**
         * Simple data class that represents a dessert. Includes the resource id integer associated with
         * the image, the price it's sold for, and the startProductionAmount, which determines when
         * the dessert starts to be produced.
         */
        @org.jetbrains.annotations.NotNull()
        public final com.example.android.dessertclicker.MainActivity.Dessert copy(int imageId, int price, int startProductionAmount) {
            return null;
        }
        
        /**
         * Simple data class that represents a dessert. Includes the resource id integer associated with
         * the image, the price it's sold for, and the startProductionAmount, which determines when
         * the dessert starts to be produced.
         */
        @java.lang.Override()
        public boolean equals(@org.jetbrains.annotations.Nullable()
        java.lang.Object other) {
            return false;
        }
        
        /**
         * Simple data class that represents a dessert. Includes the resource id integer associated with
         * the image, the price it's sold for, and the startProductionAmount, which determines when
         * the dessert starts to be produced.
         */
        @java.lang.Override()
        public int hashCode() {
            return 0;
        }
        
        /**
         * Simple data class that represents a dessert. Includes the resource id integer associated with
         * the image, the price it's sold for, and the startProductionAmount, which determines when
         * the dessert starts to be produced.
         */
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public java.lang.String toString() {
            return null;
        }
        
        public Dessert(int imageId, int price, int startProductionAmount) {
            super();
        }
        
        public final int component1() {
            return 0;
        }
        
        public final int getImageId() {
            return 0;
        }
        
        public final int component2() {
            return 0;
        }
        
        public final int getPrice() {
            return 0;
        }
        
        public final int component3() {
            return 0;
        }
        
        public final int getStartProductionAmount() {
            return 0;
        }
    }
}