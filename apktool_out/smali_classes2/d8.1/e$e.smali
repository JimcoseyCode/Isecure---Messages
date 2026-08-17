.class public final Ld8/e$e;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"

# interfaces
.implements Ld8/x$c;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ld8/e;->d(Ly8/N$a;)Ljava/util/List;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic a:Ld8/e;

.field final synthetic b:Ljava/util/ArrayList;


# direct methods
.method constructor <init>(Ld8/e;Ljava/util/ArrayList;)V
    .locals 0

    .line 1
    iput-object p1, p0, Ld8/e$e;->a:Ld8/e;

    .line 2
    .line 3
    iput-object p2, p0, Ld8/e$e;->b:Ljava/util/ArrayList;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public a()V
    .locals 0

    .line 1
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
    iget-object v0, p0, Ld8/e$e;->a:Ld8/e;

    .line 12
    .line 13
    iget-object v1, p0, Ld8/e$e;->b:Ljava/util/ArrayList;

    .line 14
    .line 15
    invoke-virtual {v0, p1, p2, v1}, Ld8/e;->y(Lk8/b;LL7/h0;Ljava/util/List;)Ld8/x$a;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    return-object p1
.end method
