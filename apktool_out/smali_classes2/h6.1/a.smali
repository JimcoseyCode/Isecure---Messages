.class public final synthetic Lh6/a;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"

# interfaces
.implements LI4/w9;


# instance fields
.field public final synthetic a:LI4/L6;


# direct methods
.method public synthetic constructor <init>(LI4/L6;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lh6/a;->a:LI4/L6;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final zza()LI4/m9;
    .locals 3

    .line 1
    new-instance v0, LI4/N6;

    .line 2
    .line 3
    invoke-direct {v0}, LI4/N6;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-static {}, Lh6/b;->f()Z

    .line 7
    .line 8
    .line 9
    move-result v1

    .line 10
    if-eqz v1, :cond_0

    .line 11
    .line 12
    sget-object v1, LI4/K6;->j:LI4/K6;

    .line 13
    .line 14
    goto :goto_0

    .line 15
    :cond_0
    sget-object v1, LI4/K6;->i:LI4/K6;

    .line 16
    .line 17
    :goto_0
    iget-object v2, p0, Lh6/a;->a:LI4/L6;

    .line 18
    .line 19
    invoke-virtual {v0, v1}, LI4/N6;->e(LI4/K6;)LI4/N6;

    .line 20
    .line 21
    .line 22
    new-instance v1, LI4/c7;

    .line 23
    .line 24
    invoke-direct {v1}, LI4/c7;-><init>()V

    .line 25
    .line 26
    .line 27
    invoke-virtual {v1, v2}, LI4/c7;->b(LI4/L6;)LI4/c7;

    .line 28
    .line 29
    .line 30
    invoke-virtual {v1}, LI4/c7;->c()LI4/e7;

    .line 31
    .line 32
    .line 33
    move-result-object v1

    .line 34
    invoke-virtual {v0, v1}, LI4/N6;->h(LI4/e7;)LI4/N6;

    .line 35
    .line 36
    .line 37
    invoke-static {v0}, LI4/A9;->a(LI4/N6;)LI4/m9;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    return-object v0
.end method
