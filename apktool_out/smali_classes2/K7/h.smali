.class LK7/h;
.super Ljava/lang/Object;

# interfaces
.implements Lw7/a;


# instance fields
.field private final g:LK7/k;

.field private final h:LB8/n;


# direct methods
.method public constructor <init>(LK7/k;LB8/n;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, LK7/h;->g:LK7/k;

    .line 5
    .line 6
    iput-object p2, p0, LK7/h;->h:LB8/n;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public invoke()Ljava/lang/Object;
    .locals 2

    .line 1
    iget-object v0, p0, LK7/h;->g:LK7/k;

    .line 2
    .line 3
    iget-object v1, p0, LK7/h;->h:LB8/n;

    .line 4
    .line 5
    invoke-static {v0, v1}, LK7/k;->F0(LK7/k;LB8/n;)LK7/u;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    return-object v0
.end method
