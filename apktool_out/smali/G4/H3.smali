.class public final LG4/H3;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"


# instance fields
.field private final a:Ljava/lang/Integer;

.field private final b:Ljava/lang/Long;

.field private final c:LG4/m4;

.field private final d:Ljava/lang/Boolean;


# direct methods
.method synthetic constructor <init>(LG4/F3;LG4/G3;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    invoke-static {p1}, LG4/F3;->h(LG4/F3;)Ljava/lang/Integer;

    .line 5
    .line 6
    .line 7
    move-result-object p2

    .line 8
    iput-object p2, p0, LG4/H3;->a:Ljava/lang/Integer;

    .line 9
    .line 10
    invoke-static {p1}, LG4/F3;->i(LG4/F3;)Ljava/lang/Long;

    .line 11
    .line 12
    .line 13
    move-result-object p2

    .line 14
    iput-object p2, p0, LG4/H3;->b:Ljava/lang/Long;

    .line 15
    .line 16
    invoke-static {p1}, LG4/F3;->f(LG4/F3;)LG4/m4;

    .line 17
    .line 18
    .line 19
    move-result-object p2

    .line 20
    iput-object p2, p0, LG4/H3;->c:LG4/m4;

    .line 21
    .line 22
    invoke-static {p1}, LG4/F3;->g(LG4/F3;)Ljava/lang/Boolean;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    iput-object p1, p0, LG4/H3;->d:Ljava/lang/Boolean;

    .line 27
    .line 28
    return-void
.end method


# virtual methods
.method public final a()LG4/m4;
    .locals 1

    .line 1
    iget-object v0, p0, LG4/H3;->c:LG4/m4;

    .line 2
    .line 3
    return-object v0
.end method

.method public final b()Ljava/lang/Boolean;
    .locals 1

    .line 1
    iget-object v0, p0, LG4/H3;->d:Ljava/lang/Boolean;

    .line 2
    .line 3
    return-object v0
.end method

.method public final c()Ljava/lang/Integer;
    .locals 1

    .line 1
    iget-object v0, p0, LG4/H3;->a:Ljava/lang/Integer;

    .line 2
    .line 3
    return-object v0
.end method

.method public final d()Ljava/lang/Long;
    .locals 1

    .line 1
    iget-object v0, p0, LG4/H3;->b:Ljava/lang/Long;

    .line 2
    .line 3
    return-object v0
.end method
