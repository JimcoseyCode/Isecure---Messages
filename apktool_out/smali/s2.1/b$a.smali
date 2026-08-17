.class public final Ls2/b$a;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ls2/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# instance fields
.field private a:Ljava/util/List;

.field private b:Lc2/n;

.field private c:Ls2/h;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method static bridge synthetic a(Ls2/b$a;)Ljava/util/List;
    .locals 0

    .line 1
    iget-object p0, p0, Ls2/b$a;->a:Ljava/util/List;

    .line 2
    .line 3
    return-object p0
.end method

.method static bridge synthetic b(Ls2/b$a;)Lc2/n;
    .locals 0

    .line 1
    iget-object p0, p0, Ls2/b$a;->b:Lc2/n;

    .line 2
    .line 3
    return-object p0
.end method

.method static bridge synthetic c(Ls2/b$a;)LN2/g;
    .locals 0

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    const/4 p0, 0x0

    .line 5
    return-object p0
.end method

.method static bridge synthetic d(Ls2/b$a;)Ls2/h;
    .locals 0

    .line 1
    iget-object p0, p0, Ls2/b$a;->c:Ls2/h;

    .line 2
    .line 3
    return-object p0
.end method


# virtual methods
.method public e()Ls2/b;
    .locals 2

    .line 1
    new-instance v0, Ls2/b;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, p0, v1}, Ls2/b;-><init>(Ls2/b$a;Ls2/c;)V

    .line 5
    .line 6
    .line 7
    return-object v0
.end method
