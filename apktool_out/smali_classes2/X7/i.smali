.class LX7/i;
.super Ljava/lang/Object;

# interfaces
.implements Lw7/a;


# instance fields
.field private final g:LX7/j;

.field private final h:Lb8/u;


# direct methods
.method public constructor <init>(LX7/j;Lb8/u;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, LX7/i;->g:LX7/j;

    .line 5
    .line 6
    iput-object p2, p0, LX7/i;->h:Lb8/u;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public invoke()Ljava/lang/Object;
    .locals 2

    .line 1
    iget-object v0, p0, LX7/i;->g:LX7/j;

    .line 2
    .line 3
    iget-object v1, p0, LX7/i;->h:Lb8/u;

    .line 4
    .line 5
    invoke-static {v0, v1}, LX7/j;->d(LX7/j;Lb8/u;)LY7/D;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    return-object v0
.end method
