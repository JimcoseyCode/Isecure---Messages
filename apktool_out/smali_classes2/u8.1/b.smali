.class public final Lu8/b;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"

# interfaces
.implements Lu8/a;


# instance fields
.field private final a:Ljava/lang/Iterable;

.field private final b:LB8/b;


# direct methods
.method public constructor <init>(LB8/n;Ljava/lang/Iterable;)V
    .locals 1

    .line 1
    const-string v0, "storageManager"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "samWithReceiverResolvers"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 12
    .line 13
    .line 14
    iput-object p2, p0, Lu8/b;->a:Ljava/lang/Iterable;

    .line 15
    .line 16
    invoke-interface {p1}, LB8/n;->a()LB8/b;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    iput-object p1, p0, Lu8/b;->b:LB8/b;

    .line 21
    .line 22
    return-void
.end method
