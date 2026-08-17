.class public final Ld8/h$a$b;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"

# interfaces
.implements Ld8/x$b;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ld8/h$a;->c(Lk8/f;)Ld8/x$b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field private final a:Ljava/util/ArrayList;

.field final synthetic b:Ld8/h;

.field final synthetic c:Lk8/f;

.field final synthetic d:Ld8/h$a;


# direct methods
.method constructor <init>(Ld8/h;Lk8/f;Ld8/h$a;)V
    .locals 0

    .line 1
    iput-object p1, p0, Ld8/h$a$b;->b:Ld8/h;

    .line 2
    .line 3
    iput-object p2, p0, Ld8/h$a$b;->c:Lk8/f;

    .line 4
    .line 5
    iput-object p3, p0, Ld8/h$a$b;->d:Ld8/h$a;

    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    new-instance p1, Ljava/util/ArrayList;

    .line 11
    .line 12
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 13
    .line 14
    .line 15
    iput-object p1, p0, Ld8/h$a$b;->a:Ljava/util/ArrayList;

    .line 16
    .line 17
    return-void
.end method

.method public static final synthetic f(Ld8/h$a$b;)Ljava/util/ArrayList;
    .locals 0

    .line 1
    iget-object p0, p0, Ld8/h$a$b;->a:Ljava/util/ArrayList;

    .line 2
    .line 3
    return-object p0
.end method


# virtual methods
.method public a()V
    .locals 3

    .line 1
    iget-object v0, p0, Ld8/h$a$b;->d:Ld8/h$a;

    .line 2
    .line 3
    iget-object v1, p0, Ld8/h$a$b;->c:Lk8/f;

    .line 4
    .line 5
    iget-object v2, p0, Ld8/h$a$b;->a:Ljava/util/ArrayList;

    .line 6
    .line 7
    invoke-virtual {v0, v1, v2}, Ld8/h$a;->g(Lk8/f;Ljava/util/ArrayList;)V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public b(Lk8/b;Lk8/f;)V
    .locals 2

    .line 1
    const-string v0, "enumClassId"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "enumEntryName"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    iget-object v0, p0, Ld8/h$a$b;->a:Ljava/util/ArrayList;

    .line 12
    .line 13
    new-instance v1, Lq8/k;

    .line 14
    .line 15
    invoke-direct {v1, p1, p2}, Lq8/k;-><init>(Lk8/b;Lk8/f;)V

    .line 16
    .line 17
    .line 18
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 19
    .line 20
    .line 21
    return-void
.end method

.method public c(Lk8/b;)Ld8/x$a;
    .locals 4

    .line 1
    const-string v0, "classId"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    new-instance v0, Ljava/util/ArrayList;

    .line 7
    .line 8
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 9
    .line 10
    .line 11
    iget-object v1, p0, Ld8/h$a$b;->b:Ld8/h;

    .line 12
    .line 13
    sget-object v2, LL7/h0;->a:LL7/h0;

    .line 14
    .line 15
    const-string v3, "NO_SOURCE"

    .line 16
    .line 17
    invoke-static {v2, v3}, Lkotlin/jvm/internal/l;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    invoke-virtual {v1, p1, v2, v0}, Ld8/h;->x(Lk8/b;LL7/h0;Ljava/util/List;)Ld8/x$a;

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    invoke-static {p1}, Lkotlin/jvm/internal/l;->d(Ljava/lang/Object;)V

    .line 25
    .line 26
    .line 27
    new-instance v1, Ld8/h$a$b$a;

    .line 28
    .line 29
    invoke-direct {v1, p1, p0, v0}, Ld8/h$a$b$a;-><init>(Ld8/x$a;Ld8/h$a$b;Ljava/util/ArrayList;)V

    .line 30
    .line 31
    .line 32
    return-object v1
.end method

.method public d(Ljava/lang/Object;)V
    .locals 3

    .line 1
    iget-object v0, p0, Ld8/h$a$b;->a:Ljava/util/ArrayList;

    .line 2
    .line 3
    iget-object v1, p0, Ld8/h$a$b;->b:Ld8/h;

    .line 4
    .line 5
    iget-object v2, p0, Ld8/h$a$b;->c:Lk8/f;

    .line 6
    .line 7
    invoke-static {v1, v2, p1}, Ld8/h;->N(Ld8/h;Lk8/f;Ljava/lang/Object;)Lq8/g;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 12
    .line 13
    .line 14
    return-void
.end method

.method public e(Lq8/f;)V
    .locals 2

    .line 1
    const-string v0, "value"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Ld8/h$a$b;->a:Ljava/util/ArrayList;

    .line 7
    .line 8
    new-instance v1, Lq8/s;

    .line 9
    .line 10
    invoke-direct {v1, p1}, Lq8/s;-><init>(Lq8/f;)V

    .line 11
    .line 12
    .line 13
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 14
    .line 15
    .line 16
    return-void
.end method
