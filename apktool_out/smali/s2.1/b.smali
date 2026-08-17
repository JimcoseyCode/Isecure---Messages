.class public Ls2/b;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ls2/b$a;
    }
.end annotation


# instance fields
.field private final a:Lc2/f;

.field private final b:Ls2/h;

.field private final c:Lc2/n;


# direct methods
.method private constructor <init>(Ls2/b$a;)V
    .locals 1

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    invoke-static {p1}, Ls2/b$a;->a(Ls2/b$a;)Ljava/util/List;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 4
    invoke-static {p1}, Ls2/b$a;->a(Ls2/b$a;)Ljava/util/List;

    move-result-object v0

    invoke-static {v0}, Lc2/f;->o(Ljava/util/List;)Lc2/f;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    .line 5
    :goto_0
    iput-object v0, p0, Ls2/b;->a:Lc2/f;

    .line 6
    invoke-static {p1}, Ls2/b$a;->b(Ls2/b$a;)Lc2/n;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 7
    invoke-static {p1}, Ls2/b$a;->b(Ls2/b$a;)Lc2/n;

    move-result-object v0

    goto :goto_1

    .line 8
    :cond_1
    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-static {v0}, Lc2/o;->a(Ljava/lang/Object;)Lc2/n;

    move-result-object v0

    :goto_1
    iput-object v0, p0, Ls2/b;->c:Lc2/n;

    .line 9
    invoke-static {p1}, Ls2/b$a;->d(Ls2/b$a;)Ls2/h;

    move-result-object v0

    iput-object v0, p0, Ls2/b;->b:Ls2/h;

    .line 10
    invoke-static {p1}, Ls2/b$a;->c(Ls2/b$a;)LN2/g;

    return-void
.end method

.method synthetic constructor <init>(Ls2/b$a;Ls2/c;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Ls2/b;-><init>(Ls2/b$a;)V

    return-void
.end method

.method public static e()Ls2/b$a;
    .locals 1

    .line 1
    new-instance v0, Ls2/b$a;

    .line 2
    .line 3
    invoke-direct {v0}, Ls2/b$a;-><init>()V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method


# virtual methods
.method public a()Lc2/f;
    .locals 1

    .line 1
    iget-object v0, p0, Ls2/b;->a:Lc2/f;

    .line 2
    .line 3
    return-object v0
.end method

.method public b()Lc2/n;
    .locals 1

    .line 1
    iget-object v0, p0, Ls2/b;->c:Lc2/n;

    .line 2
    .line 3
    return-object v0
.end method

.method public c()LN2/g;
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    return-object v0
.end method

.method public d()Ls2/h;
    .locals 1

    .line 1
    iget-object v0, p0, Ls2/b;->b:Ls2/h;

    .line 2
    .line 3
    return-object v0
.end method
