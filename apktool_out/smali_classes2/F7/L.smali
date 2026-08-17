.class LF7/L;
.super Ljava/lang/Object;

# interfaces
.implements Lw7/a;


# instance fields
.field private final g:LC8/S;

.field private final h:LF7/X$a;

.field private final i:LF7/X;


# direct methods
.method public constructor <init>(LC8/S;LF7/X$a;LF7/X;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, LF7/L;->g:LC8/S;

    .line 5
    .line 6
    iput-object p2, p0, LF7/L;->h:LF7/X$a;

    .line 7
    .line 8
    iput-object p3, p0, LF7/L;->i:LF7/X;

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public invoke()Ljava/lang/Object;
    .locals 3

    .line 1
    iget-object v0, p0, LF7/L;->g:LC8/S;

    .line 2
    .line 3
    iget-object v1, p0, LF7/L;->h:LF7/X$a;

    .line 4
    .line 5
    iget-object v2, p0, LF7/L;->i:LF7/X;

    .line 6
    .line 7
    invoke-static {v0, v1, v2}, LF7/X$a;->n(LC8/S;LF7/X$a;LF7/X;)Ljava/lang/reflect/Type;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    return-object v0
.end method
