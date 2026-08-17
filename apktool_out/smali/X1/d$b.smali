.class public final LX1/d$b;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LX1/d;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation


# instance fields
.field private a:I

.field private b:Ljava/lang/String;

.field private c:Lc2/n;

.field private d:J

.field private e:J

.field private f:J

.field private g:LX1/j;

.field private h:LW1/a;

.field private i:LW1/c;

.field private j:LZ1/b;

.field private k:Z

.field private final l:Landroid/content/Context;


# direct methods
.method private constructor <init>(Landroid/content/Context;)V
    .locals 2

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x1

    .line 3
    iput v0, p0, LX1/d$b;->a:I

    .line 4
    const-string v0, "image_cache"

    iput-object v0, p0, LX1/d$b;->b:Ljava/lang/String;

    const-wide/32 v0, 0x2800000

    .line 5
    iput-wide v0, p0, LX1/d$b;->d:J

    const-wide/32 v0, 0xa00000

    .line 6
    iput-wide v0, p0, LX1/d$b;->e:J

    const-wide/32 v0, 0x200000

    .line 7
    iput-wide v0, p0, LX1/d$b;->f:J

    .line 8
    new-instance v0, LX1/c;

    invoke-direct {v0}, LX1/c;-><init>()V

    iput-object v0, p0, LX1/d$b;->g:LX1/j;

    .line 9
    iput-object p1, p0, LX1/d$b;->l:Landroid/content/Context;

    return-void
.end method

.method synthetic constructor <init>(Landroid/content/Context;LX1/e;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, LX1/d$b;-><init>(Landroid/content/Context;)V

    return-void
.end method

.method static bridge synthetic a(LX1/d$b;)Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, LX1/d$b;->b:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method static bridge synthetic b(LX1/d$b;)Lc2/n;
    .locals 0

    .line 1
    iget-object p0, p0, LX1/d$b;->c:Lc2/n;

    .line 2
    .line 3
    return-object p0
.end method

.method static bridge synthetic c(LX1/d$b;)LW1/a;
    .locals 0

    .line 1
    iget-object p0, p0, LX1/d$b;->h:LW1/a;

    .line 2
    .line 3
    return-object p0
.end method

.method static bridge synthetic d(LX1/d$b;)LW1/c;
    .locals 0

    .line 1
    iget-object p0, p0, LX1/d$b;->i:LW1/c;

    .line 2
    .line 3
    return-object p0
.end method

.method static bridge synthetic e(LX1/d$b;)Landroid/content/Context;
    .locals 0

    .line 1
    iget-object p0, p0, LX1/d$b;->l:Landroid/content/Context;

    .line 2
    .line 3
    return-object p0
.end method

.method static bridge synthetic f(LX1/d$b;)LZ1/b;
    .locals 0

    .line 1
    iget-object p0, p0, LX1/d$b;->j:LZ1/b;

    .line 2
    .line 3
    return-object p0
.end method

.method static bridge synthetic g(LX1/d$b;)LX1/j;
    .locals 0

    .line 1
    iget-object p0, p0, LX1/d$b;->g:LX1/j;

    .line 2
    .line 3
    return-object p0
.end method

.method static bridge synthetic h(LX1/d$b;)Z
    .locals 0

    .line 1
    iget-boolean p0, p0, LX1/d$b;->k:Z

    .line 2
    .line 3
    return p0
.end method

.method static bridge synthetic i(LX1/d$b;)J
    .locals 2

    .line 1
    iget-wide v0, p0, LX1/d$b;->d:J

    .line 2
    .line 3
    return-wide v0
.end method

.method static bridge synthetic j(LX1/d$b;)J
    .locals 2

    .line 1
    iget-wide v0, p0, LX1/d$b;->e:J

    .line 2
    .line 3
    return-wide v0
.end method

.method static bridge synthetic k(LX1/d$b;)J
    .locals 2

    .line 1
    iget-wide v0, p0, LX1/d$b;->f:J

    .line 2
    .line 3
    return-wide v0
.end method

.method static bridge synthetic l(LX1/d$b;)I
    .locals 0

    .line 1
    iget p0, p0, LX1/d$b;->a:I

    .line 2
    .line 3
    return p0
.end method

.method static bridge synthetic m(LX1/d$b;Lc2/n;)V
    .locals 0

    .line 1
    iput-object p1, p0, LX1/d$b;->c:Lc2/n;

    .line 2
    .line 3
    return-void
.end method


# virtual methods
.method public n()LX1/d;
    .locals 1

    .line 1
    new-instance v0, LX1/d;

    .line 2
    .line 3
    invoke-direct {v0, p0}, LX1/d;-><init>(LX1/d$b;)V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method
