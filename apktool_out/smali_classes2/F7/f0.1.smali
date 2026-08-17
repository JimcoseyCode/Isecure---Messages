.class LF7/f0;
.super Ljava/lang/Object;

# interfaces
.implements Lw7/a;


# instance fields
.field private final g:LF7/i0;

.field private final h:Ljava/lang/String;


# direct methods
.method public constructor <init>(LF7/i0;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, LF7/f0;->g:LF7/i0;

    .line 5
    .line 6
    iput-object p2, p0, LF7/f0;->h:Ljava/lang/String;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public invoke()Ljava/lang/Object;
    .locals 2

    .line 1
    iget-object v0, p0, LF7/f0;->g:LF7/i0;

    .line 2
    .line 3
    iget-object v1, p0, LF7/f0;->h:Ljava/lang/String;

    .line 4
    .line 5
    invoke-static {v0, v1}, LF7/i0;->Z(LF7/i0;Ljava/lang/String;)LL7/z;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    return-object v0
.end method
