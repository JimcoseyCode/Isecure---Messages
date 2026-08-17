.class public abstract Lcom/facebook/drawee/view/d;
.super Lcom/facebook/drawee/view/c;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"


# direct methods
.method public constructor <init>(Landroid/content/Context;Lz2/a;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/facebook/drawee/view/c;-><init>(Landroid/content/Context;)V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0, p2}, Lcom/facebook/drawee/view/c;->setHierarchy(LB2/b;)V

    .line 5
    .line 6
    .line 7
    return-void
.end method


# virtual methods
.method protected inflateHierarchy(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    .line 1
    invoke-static {}, Lj3/b;->d()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    const-string v0, "GenericDraweeView#inflateHierarchy"

    .line 8
    .line 9
    invoke-static {v0}, Lj3/b;->a(Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    :cond_0
    invoke-static {p1, p2}, Lz2/c;->d(Landroid/content/Context;Landroid/util/AttributeSet;)Lz2/b;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    invoke-virtual {p1}, Lz2/b;->f()F

    .line 17
    .line 18
    .line 19
    move-result p2

    .line 20
    invoke-virtual {p0, p2}, Lcom/facebook/drawee/view/c;->setAspectRatio(F)V

    .line 21
    .line 22
    .line 23
    invoke-virtual {p1}, Lz2/b;->a()Lz2/a;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    invoke-virtual {p0, p1}, Lcom/facebook/drawee/view/c;->setHierarchy(LB2/b;)V

    .line 28
    .line 29
    .line 30
    invoke-static {}, Lj3/b;->d()Z

    .line 31
    .line 32
    .line 33
    move-result p1

    .line 34
    if-eqz p1, :cond_1

    .line 35
    .line 36
    invoke-static {}, Lj3/b;->b()V

    .line 37
    .line 38
    .line 39
    :cond_1
    return-void
.end method
