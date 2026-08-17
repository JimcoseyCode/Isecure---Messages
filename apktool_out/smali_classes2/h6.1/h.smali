.class public final Lh6/h;
.super Lc6/e;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"


# instance fields
.field private final b:Lc6/i;


# direct methods
.method public constructor <init>(Lc6/i;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lc6/e;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lh6/h;->b:Lc6/i;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method protected final bridge synthetic a(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    .line 1
    iget-object v0, p0, Lh6/h;->b:Lc6/i;

    .line 2
    .line 3
    check-cast p1, Le6/b;

    .line 4
    .line 5
    invoke-virtual {v0}, Lc6/i;->b()Landroid/content/Context;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-static {}, Lh6/b;->d()Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    invoke-static {v1}, LI4/J9;->b(Ljava/lang/String;)LI4/x9;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    invoke-static {v0}, Lh6/n;->c(Landroid/content/Context;)Z

    .line 18
    .line 19
    .line 20
    move-result v2

    .line 21
    if-nez v2, :cond_1

    .line 22
    .line 23
    invoke-static {}, Lcom/google/android/gms/common/b;->f()Lcom/google/android/gms/common/b;

    .line 24
    .line 25
    .line 26
    move-result-object v2

    .line 27
    invoke-virtual {v2, v0}, Lcom/google/android/gms/common/b;->a(Landroid/content/Context;)I

    .line 28
    .line 29
    .line 30
    move-result v2

    .line 31
    const v3, 0xc306c20

    .line 32
    .line 33
    .line 34
    if-lt v2, v3, :cond_0

    .line 35
    .line 36
    goto :goto_0

    .line 37
    :cond_0
    new-instance v2, Lh6/p;

    .line 38
    .line 39
    invoke-direct {v2, v0, p1, v1}, Lh6/p;-><init>(Landroid/content/Context;Le6/b;LI4/x9;)V

    .line 40
    .line 41
    .line 42
    goto :goto_1

    .line 43
    :cond_1
    :goto_0
    new-instance v2, Lh6/n;

    .line 44
    .line 45
    invoke-direct {v2, v0, p1, v1}, Lh6/n;-><init>(Landroid/content/Context;Le6/b;LI4/x9;)V

    .line 46
    .line 47
    .line 48
    :goto_1
    iget-object v0, p0, Lh6/h;->b:Lc6/i;

    .line 49
    .line 50
    new-instance v3, Lh6/k;

    .line 51
    .line 52
    invoke-direct {v3, v0, p1, v2, v1}, Lh6/k;-><init>(Lc6/i;Le6/b;Lh6/l;LI4/x9;)V

    .line 53
    .line 54
    .line 55
    return-object v3
.end method
