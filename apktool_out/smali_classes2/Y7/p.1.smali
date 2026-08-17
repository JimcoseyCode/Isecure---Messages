.class LY7/p;
.super Ljava/lang/Object;

# interfaces
.implements Lw7/a;


# instance fields
.field private final g:LY7/z;

.field private final h:LX7/k;


# direct methods
.method public constructor <init>(LY7/z;LX7/k;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, LY7/p;->g:LY7/z;

    .line 5
    .line 6
    iput-object p2, p0, LY7/p;->h:LX7/k;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public invoke()Ljava/lang/Object;
    .locals 2

    .line 1
    iget-object v0, p0, LY7/p;->g:LY7/z;

    .line 2
    .line 3
    iget-object v1, p0, LY7/p;->h:LX7/k;

    .line 4
    .line 5
    invoke-static {v0, v1}, LY7/z;->i0(LY7/z;LX7/k;)Ljava/util/List;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    return-object v0
.end method
