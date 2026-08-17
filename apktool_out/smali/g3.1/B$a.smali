.class public final Lg3/B$a;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lg3/B;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# instance fields
.field private a:Lg3/E;

.field private b:Lg3/F;

.field private c:Lg3/E;

.field private d:Lf2/d;

.field private e:Lg3/E;

.field private f:Lg3/F;

.field private g:Lg3/E;

.field private h:Lg3/F;

.field private i:Ljava/lang/String;

.field private j:I

.field private k:I

.field private l:Z

.field public m:Z


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lg3/C;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lg3/B$a;-><init>()V

    return-void
.end method

.method static bridge synthetic a(Lg3/B$a;)I
    .locals 0

    .line 1
    iget p0, p0, Lg3/B$a;->k:I

    .line 2
    .line 3
    return p0
.end method

.method static bridge synthetic b(Lg3/B$a;)I
    .locals 0

    .line 1
    iget p0, p0, Lg3/B$a;->j:I

    .line 2
    .line 3
    return p0
.end method

.method static bridge synthetic c(Lg3/B$a;)Lg3/E;
    .locals 0

    .line 1
    iget-object p0, p0, Lg3/B$a;->a:Lg3/E;

    .line 2
    .line 3
    return-object p0
.end method

.method static bridge synthetic d(Lg3/B$a;)Lg3/F;
    .locals 0

    .line 1
    iget-object p0, p0, Lg3/B$a;->b:Lg3/F;

    .line 2
    .line 3
    return-object p0
.end method

.method static bridge synthetic e(Lg3/B$a;)Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lg3/B$a;->i:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method static bridge synthetic f(Lg3/B$a;)Lg3/E;
    .locals 0

    .line 1
    iget-object p0, p0, Lg3/B$a;->c:Lg3/E;

    .line 2
    .line 3
    return-object p0
.end method

.method static bridge synthetic g(Lg3/B$a;)Lg3/E;
    .locals 0

    .line 1
    iget-object p0, p0, Lg3/B$a;->e:Lg3/E;

    .line 2
    .line 3
    return-object p0
.end method

.method static bridge synthetic h(Lg3/B$a;)Lg3/F;
    .locals 0

    .line 1
    iget-object p0, p0, Lg3/B$a;->f:Lg3/F;

    .line 2
    .line 3
    return-object p0
.end method

.method static bridge synthetic i(Lg3/B$a;)Lf2/d;
    .locals 0

    .line 1
    iget-object p0, p0, Lg3/B$a;->d:Lf2/d;

    .line 2
    .line 3
    return-object p0
.end method

.method static bridge synthetic j(Lg3/B$a;)Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Lg3/B$a;->l:Z

    .line 2
    .line 3
    return p0
.end method

.method static bridge synthetic k(Lg3/B$a;)Lg3/E;
    .locals 0

    .line 1
    iget-object p0, p0, Lg3/B$a;->g:Lg3/E;

    .line 2
    .line 3
    return-object p0
.end method

.method static bridge synthetic l(Lg3/B$a;)Lg3/F;
    .locals 0

    .line 1
    iget-object p0, p0, Lg3/B$a;->h:Lg3/F;

    .line 2
    .line 3
    return-object p0
.end method


# virtual methods
.method public m()Lg3/B;
    .locals 2

    .line 1
    new-instance v0, Lg3/B;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, p0, v1}, Lg3/B;-><init>(Lg3/B$a;Lg3/C;)V

    .line 5
    .line 6
    .line 7
    return-object v0
.end method
