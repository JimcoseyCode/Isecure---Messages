.class LC8/f;
.super Ljava/lang/Object;

# interfaces
.implements Lw7/a;


# instance fields
.field private final g:LC8/u0;

.field private final h:LG8/o;

.field private final i:LG8/j;

.field private final j:LG8/j;


# direct methods
.method public constructor <init>(LC8/u0;LG8/o;LG8/j;LG8/j;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, LC8/f;->g:LC8/u0;

    .line 5
    .line 6
    iput-object p2, p0, LC8/f;->h:LG8/o;

    .line 7
    .line 8
    iput-object p3, p0, LC8/f;->i:LG8/j;

    .line 9
    .line 10
    iput-object p4, p0, LC8/f;->j:LG8/j;

    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public invoke()Ljava/lang/Object;
    .locals 4

    .line 1
    iget-object v0, p0, LC8/f;->g:LC8/u0;

    .line 2
    .line 3
    iget-object v1, p0, LC8/f;->h:LG8/o;

    .line 4
    .line 5
    iget-object v2, p0, LC8/f;->i:LG8/j;

    .line 6
    .line 7
    iget-object v3, p0, LC8/f;->j:LG8/j;

    .line 8
    .line 9
    invoke-static {v0, v1, v2, v3}, LC8/g;->b(LC8/u0;LG8/o;LG8/j;LG8/j;)Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    return-object v0
.end method
