.class public final Ld8/d$a;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"

# interfaces
.implements Ld8/x$d;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ld8/d;->H(Ld8/x;)Ld8/g;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ld8/d$a$a;,
        Ld8/d$a$b;
    }
.end annotation


# instance fields
.field final synthetic a:Ld8/d;

.field final synthetic b:Ljava/util/HashMap;

.field final synthetic c:Ld8/x;

.field final synthetic d:Ljava/util/HashMap;

.field final synthetic e:Ljava/util/HashMap;


# direct methods
.method constructor <init>(Ld8/d;Ljava/util/HashMap;Ld8/x;Ljava/util/HashMap;Ljava/util/HashMap;)V
    .locals 0

    .line 1
    iput-object p1, p0, Ld8/d$a;->a:Ld8/d;

    .line 2
    .line 3
    iput-object p2, p0, Ld8/d$a;->b:Ljava/util/HashMap;

    .line 4
    .line 5
    iput-object p3, p0, Ld8/d$a;->c:Ld8/x;

    .line 6
    .line 7
    iput-object p4, p0, Ld8/d$a;->d:Ljava/util/HashMap;

    .line 8
    .line 9
    iput-object p5, p0, Ld8/d$a;->e:Ljava/util/HashMap;

    .line 10
    .line 11
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 12
    .line 13
    .line 14
    return-void
.end method


# virtual methods
.method public a(Lk8/f;Ljava/lang/String;)Ld8/x$e;
    .locals 3

    .line 1
    const-string v0, "name"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "desc"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    new-instance v0, Ld8/d$a$a;

    .line 12
    .line 13
    sget-object v1, Ld8/A;->b:Ld8/A$a;

    .line 14
    .line 15
    invoke-virtual {p1}, Lk8/f;->j()Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    const-string v2, "asString(...)"

    .line 20
    .line 21
    invoke-static {p1, v2}, Lkotlin/jvm/internal/l;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 22
    .line 23
    .line 24
    invoke-virtual {v1, p1, p2}, Ld8/A$a;->d(Ljava/lang/String;Ljava/lang/String;)Ld8/A;

    .line 25
    .line 26
    .line 27
    move-result-object p1

    .line 28
    invoke-direct {v0, p0, p1}, Ld8/d$a$a;-><init>(Ld8/d$a;Ld8/A;)V

    .line 29
    .line 30
    .line 31
    return-object v0
.end method

.method public b(Lk8/f;Ljava/lang/String;Ljava/lang/Object;)Ld8/x$c;
    .locals 2

    .line 1
    const-string v0, "name"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "desc"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    sget-object v0, Ld8/A;->b:Ld8/A$a;

    .line 12
    .line 13
    invoke-virtual {p1}, Lk8/f;->j()Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    const-string v1, "asString(...)"

    .line 18
    .line 19
    invoke-static {p1, v1}, Lkotlin/jvm/internal/l;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 20
    .line 21
    .line 22
    invoke-virtual {v0, p1, p2}, Ld8/A$a;->a(Ljava/lang/String;Ljava/lang/String;)Ld8/A;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    if-eqz p3, :cond_0

    .line 27
    .line 28
    iget-object v0, p0, Ld8/d$a;->a:Ld8/d;

    .line 29
    .line 30
    invoke-virtual {v0, p2, p3}, Ld8/d;->I(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object p2

    .line 34
    if-eqz p2, :cond_0

    .line 35
    .line 36
    iget-object p3, p0, Ld8/d$a;->e:Ljava/util/HashMap;

    .line 37
    .line 38
    invoke-interface {p3, p1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    :cond_0
    new-instance p2, Ld8/d$a$b;

    .line 42
    .line 43
    invoke-direct {p2, p0, p1}, Ld8/d$a$b;-><init>(Ld8/d$a;Ld8/A;)V

    .line 44
    .line 45
    .line 46
    return-object p2
.end method
