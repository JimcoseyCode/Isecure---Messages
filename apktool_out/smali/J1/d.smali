.class final LJ1/d;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"

# interfaces
.implements LJ1/b;


# instance fields
.field private final g:Landroid/content/Context;

.field final h:LJ1/b$a;


# direct methods
.method constructor <init>(Landroid/content/Context;LJ1/b$a;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 5
    .line 6
    .line 7
    move-result-object p1

    .line 8
    iput-object p1, p0, LJ1/d;->g:Landroid/content/Context;

    .line 9
    .line 10
    iput-object p2, p0, LJ1/d;->h:LJ1/b$a;

    .line 11
    .line 12
    return-void
.end method

.method private a()V
    .locals 2

    .line 1
    iget-object v0, p0, LJ1/d;->g:Landroid/content/Context;

    .line 2
    .line 3
    invoke-static {v0}, LJ1/r;->a(Landroid/content/Context;)LJ1/r;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    iget-object v1, p0, LJ1/d;->h:LJ1/b$a;

    .line 8
    .line 9
    invoke-virtual {v0, v1}, LJ1/r;->d(LJ1/b$a;)V

    .line 10
    .line 11
    .line 12
    return-void
.end method

.method private b()V
    .locals 2

    .line 1
    iget-object v0, p0, LJ1/d;->g:Landroid/content/Context;

    .line 2
    .line 3
    invoke-static {v0}, LJ1/r;->a(Landroid/content/Context;)LJ1/r;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    iget-object v1, p0, LJ1/d;->h:LJ1/b$a;

    .line 8
    .line 9
    invoke-virtual {v0, v1}, LJ1/r;->e(LJ1/b$a;)V

    .line 10
    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public onDestroy()V
    .locals 0

    .line 1
    return-void
.end method

.method public onStart()V
    .locals 0

    .line 1
    invoke-direct {p0}, LJ1/d;->a()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public onStop()V
    .locals 0

    .line 1
    invoke-direct {p0}, LJ1/d;->b()V

    .line 2
    .line 3
    .line 4
    return-void
.end method
