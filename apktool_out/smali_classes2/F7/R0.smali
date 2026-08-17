.class LF7/R0;
.super Ljava/lang/Object;

# interfaces
.implements Lw7/a;


# instance fields
.field private final g:LF7/U0;

.field private final h:Lw7/a;


# direct methods
.method public constructor <init>(LF7/U0;Lw7/a;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, LF7/R0;->g:LF7/U0;

    .line 5
    .line 6
    iput-object p2, p0, LF7/R0;->h:Lw7/a;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public invoke()Ljava/lang/Object;
    .locals 2

    .line 1
    iget-object v0, p0, LF7/R0;->g:LF7/U0;

    .line 2
    .line 3
    iget-object v1, p0, LF7/R0;->h:Lw7/a;

    .line 4
    .line 5
    invoke-static {v0, v1}, LF7/U0;->e(LF7/U0;Lw7/a;)Ljava/util/List;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    return-object v0
.end method
