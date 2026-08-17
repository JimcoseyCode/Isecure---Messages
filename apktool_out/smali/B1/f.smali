.class public final LB1/f;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"

# interfaces
.implements LB1/n;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LB1/f$c;,
        LB1/f$a;,
        LB1/f$b;,
        LB1/f$e;,
        LB1/f$d;
    }
.end annotation


# instance fields
.field private final a:Landroid/content/Context;

.field private final b:LB1/f$e;


# direct methods
.method constructor <init>(Landroid/content/Context;LB1/f$e;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 5
    .line 6
    .line 7
    move-result-object p1

    .line 8
    iput-object p1, p0, LB1/f;->a:Landroid/content/Context;

    .line 9
    .line 10
    iput-object p2, p0, LB1/f;->b:LB1/f$e;

    .line 11
    .line 12
    return-void
.end method

.method public static a(Landroid/content/Context;)LB1/o;
    .locals 1

    .line 1
    new-instance v0, LB1/f$a;

    .line 2
    .line 3
    invoke-direct {v0, p0}, LB1/f$a;-><init>(Landroid/content/Context;)V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method

.method public static c(Landroid/content/Context;)LB1/o;
    .locals 1

    .line 1
    new-instance v0, LB1/f$b;

    .line 2
    .line 3
    invoke-direct {v0, p0}, LB1/f$b;-><init>(Landroid/content/Context;)V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method

.method public static e(Landroid/content/Context;)LB1/o;
    .locals 1

    .line 1
    new-instance v0, LB1/f$c;

    .line 2
    .line 3
    invoke-direct {v0, p0}, LB1/f$c;-><init>(Landroid/content/Context;)V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method


# virtual methods
.method public b(Ljava/lang/Integer;IILv1/h;)LB1/n$a;
    .locals 3

    .line 1
    sget-object p2, LF1/l;->b:Lv1/g;

    .line 2
    .line 3
    invoke-virtual {p4, p2}, Lv1/h;->b(Lv1/g;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p2

    .line 7
    check-cast p2, Landroid/content/res/Resources$Theme;

    .line 8
    .line 9
    if-eqz p2, :cond_0

    .line 10
    .line 11
    invoke-virtual {p2}, Landroid/content/res/Resources$Theme;->getResources()Landroid/content/res/Resources;

    .line 12
    .line 13
    .line 14
    move-result-object p3

    .line 15
    goto :goto_0

    .line 16
    :cond_0
    iget-object p3, p0, LB1/f;->a:Landroid/content/Context;

    .line 17
    .line 18
    invoke-virtual {p3}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 19
    .line 20
    .line 21
    move-result-object p3

    .line 22
    :goto_0
    new-instance p4, LB1/n$a;

    .line 23
    .line 24
    new-instance v0, LP1/c;

    .line 25
    .line 26
    invoke-direct {v0, p1}, LP1/c;-><init>(Ljava/lang/Object;)V

    .line 27
    .line 28
    .line 29
    new-instance v1, LB1/f$d;

    .line 30
    .line 31
    iget-object v2, p0, LB1/f;->b:LB1/f$e;

    .line 32
    .line 33
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 34
    .line 35
    .line 36
    move-result p1

    .line 37
    invoke-direct {v1, p2, p3, v2, p1}, LB1/f$d;-><init>(Landroid/content/res/Resources$Theme;Landroid/content/res/Resources;LB1/f$e;I)V

    .line 38
    .line 39
    .line 40
    invoke-direct {p4, v0, v1}, LB1/n$a;-><init>(Lv1/f;Lcom/bumptech/glide/load/data/d;)V

    .line 41
    .line 42
    .line 43
    return-object p4
.end method

.method public bridge synthetic buildLoadData(Ljava/lang/Object;IILv1/h;)LB1/n$a;
    .locals 0

    .line 1
    check-cast p1, Ljava/lang/Integer;

    .line 2
    .line 3
    invoke-virtual {p0, p1, p2, p3, p4}, LB1/f;->b(Ljava/lang/Integer;IILv1/h;)LB1/n$a;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    return-object p1
.end method

.method public d(Ljava/lang/Integer;)Z
    .locals 0

    .line 1
    const/4 p1, 0x1

    .line 2
    return p1
.end method

.method public bridge synthetic handles(Ljava/lang/Object;)Z
    .locals 0

    .line 1
    check-cast p1, Ljava/lang/Integer;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, LB1/f;->d(Ljava/lang/Integer;)Z

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    return p1
.end method
