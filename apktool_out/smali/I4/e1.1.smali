.class public final LI4/e1;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"


# instance fields
.field private final a:LI4/c1;

.field private final b:Ljava/lang/Integer;

.field private final c:LI4/n6;


# direct methods
.method synthetic constructor <init>(LI4/Z0;LI4/d1;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    invoke-static {p1}, LI4/Z0;->d(LI4/Z0;)LI4/c1;

    .line 5
    .line 6
    .line 7
    move-result-object p2

    .line 8
    iput-object p2, p0, LI4/e1;->a:LI4/c1;

    .line 9
    .line 10
    invoke-static {p1}, LI4/Z0;->g(LI4/Z0;)Ljava/lang/Integer;

    .line 11
    .line 12
    .line 13
    move-result-object p2

    .line 14
    iput-object p2, p0, LI4/e1;->b:Ljava/lang/Integer;

    .line 15
    .line 16
    invoke-static {p1}, LI4/Z0;->f(LI4/Z0;)LI4/n6;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    iput-object p1, p0, LI4/e1;->c:LI4/n6;

    .line 21
    .line 22
    return-void
.end method


# virtual methods
.method public final a()LI4/c1;
    .locals 1

    .line 1
    iget-object v0, p0, LI4/e1;->a:LI4/c1;

    .line 2
    .line 3
    return-object v0
.end method

.method public final b()LI4/n6;
    .locals 1

    .line 1
    iget-object v0, p0, LI4/e1;->c:LI4/n6;

    .line 2
    .line 3
    return-object v0
.end method

.method public final c()Ljava/lang/Integer;
    .locals 1

    .line 1
    iget-object v0, p0, LI4/e1;->b:Ljava/lang/Integer;

    .line 2
    .line 3
    return-object v0
.end method
