.class LF7/P;
.super Ljava/lang/Object;

# interfaces
.implements Lw7/a;


# instance fields
.field private final g:LF7/X;


# direct methods
.method public constructor <init>(LF7/X;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, LF7/P;->g:LF7/X;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public invoke()Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, LF7/P;->g:LF7/X;

    .line 2
    .line 3
    invoke-static {v0}, LF7/X$a;->q(LF7/X;)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method
