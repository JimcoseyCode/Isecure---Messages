.class public Ld8/d$a$b;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"

# interfaces
.implements Ld8/x$c;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ld8/d$a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "b"
.end annotation


# instance fields
.field private final a:Ld8/A;

.field private final b:Ljava/util/ArrayList;

.field final synthetic c:Ld8/d$a;


# direct methods
.method public constructor <init>(Ld8/d$a;Ld8/A;)V
    .locals 1

    .line 1
    const-string v0, "signature"

    .line 2
    .line 3
    invoke-static {p2, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iput-object p1, p0, Ld8/d$a$b;->c:Ld8/d$a;

    .line 7
    .line 8
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 9
    .line 10
    .line 11
    iput-object p2, p0, Ld8/d$a$b;->a:Ld8/A;

    .line 12
    .line 13
    new-instance p1, Ljava/util/ArrayList;

    .line 14
    .line 15
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 16
    .line 17
    .line 18
    iput-object p1, p0, Ld8/d$a$b;->b:Ljava/util/ArrayList;

    .line 19
    .line 20
    return-void
.end method


# virtual methods
.method public a()V
    .locals 3

    .line 1
    iget-object v0, p0, Ld8/d$a$b;->b:Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    iget-object v0, p0, Ld8/d$a$b;->c:Ld8/d$a;

    .line 10
    .line 11
    iget-object v0, v0, Ld8/d$a;->b:Ljava/util/HashMap;

    .line 12
    .line 13
    iget-object v1, p0, Ld8/d$a$b;->a:Ld8/A;

    .line 14
    .line 15
    iget-object v2, p0, Ld8/d$a$b;->b:Ljava/util/ArrayList;

    .line 16
    .line 17
    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    :cond_0
    return-void
.end method

.method public c(Lk8/b;LL7/h0;)Ld8/x$a;
    .locals 2

    .line 1
    const-string v0, "classId"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "source"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    iget-object v0, p0, Ld8/d$a$b;->c:Ld8/d$a;

    .line 12
    .line 13
    iget-object v0, v0, Ld8/d$a;->a:Ld8/d;

    .line 14
    .line 15
    iget-object v1, p0, Ld8/d$a$b;->b:Ljava/util/ArrayList;

    .line 16
    .line 17
    invoke-virtual {v0, p1, p2, v1}, Ld8/e;->y(Lk8/b;LL7/h0;Ljava/util/List;)Ld8/x$a;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    return-object p1
.end method

.method protected final d()Ld8/A;
    .locals 1

    .line 1
    iget-object v0, p0, Ld8/d$a$b;->a:Ld8/A;

    .line 2
    .line 3
    return-object v0
.end method
