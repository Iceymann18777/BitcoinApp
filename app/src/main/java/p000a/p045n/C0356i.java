package p000a.p045n;

import java.nio.file.Path;

import android.animation.PropertyValuesHolder;
import android.animation.TypeConverter;
import android.graphics.PointF;
import android.os.Build;
import android.util.Property;

/* renamed from: a.n.i */
/* loaded from: classes.dex */
class C0356i {
    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static PropertyValuesHolder m2858a(Property<?, PointF> property, Path path) {
        return Build.VERSION.SDK_INT >= 21 ? PropertyValuesHolder.ofObject(property, (TypeConverter) null, path) : PropertyValuesHolder.ofFloat(new C0354h(property, path), 0.0f, 1.0f);
    }
}
