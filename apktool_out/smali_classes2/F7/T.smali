.class LF7/T;
.super Ljava/lang/Object;

# interfaces
.implements Lw7/a;


# instance fields
.field private final g:LF7/X$a;

.field private final h:LF7/X;


# direct methods
.method public constructor <init>(LF7/X$a;LF7/X;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, LF7/T;->g:LF7/X$a;

    .line 5
    .line 6
    iput-object p2, p0, LF7/T;->h:LF7/X;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public invoke()Ljava/lang/Object;
    .locals 2

    .line 1
    iget-object v0, p0, LF7/T;->g:LF7/X$a;

    .line 2
    .line 3
    iget-object v1, p0, LF7/T;->h:LF7/X;

    .line 4
    .line 5
    invoke-static {v0, v1}, LF7/X$a;->t(LF7/X$a;LF7/X;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    return-object v0
.end method
