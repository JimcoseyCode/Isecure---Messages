.class Lcom/google/android/material/navigation/e$b;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"

# interfaces
.implements Landroid/animation/ValueAnimator$AnimatorUpdateListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/android/material/navigation/e;->l(F)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:F

.field final synthetic b:Lcom/google/android/material/navigation/e;


# direct methods
.method constructor <init>(Lcom/google/android/material/navigation/e;F)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/google/android/material/navigation/e$b;->b:Lcom/google/android/material/navigation/e;

    .line 2
    .line 3
    iput p2, p0, Lcom/google/android/material/navigation/e$b;->a:F

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public onAnimationUpdate(Landroid/animation/ValueAnimator;)V
    .locals 2

    .line 1
    invoke-virtual {p1}, Landroid/animation/ValueAnimator;->getAnimatedValue()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    check-cast p1, Ljava/lang/Float;

    .line 6
    .line 7
    invoke-virtual {p1}, Ljava/lang/Float;->floatValue()F

    .line 8
    .line 9
    .line 10
    move-result p1

    .line 11
    iget-object v0, p0, Lcom/google/android/material/navigation/e$b;->b:Lcom/google/android/material/navigation/e;

    .line 12
    .line 13
    iget v1, p0, Lcom/google/android/material/navigation/e$b;->a:F

    .line 14
    .line 15
    invoke-static {v0, p1, v1}, Lcom/google/android/material/navigation/e;->b(Lcom/google/android/material/navigation/e;FF)V

    .line 16
    .line 17
    .line 18
    return-void
.end method
