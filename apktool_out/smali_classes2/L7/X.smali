.class public final LL7/X;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"


# instance fields
.field private final a:LL7/i;

.field private final b:Ljava/util/List;

.field private final c:LL7/X;


# direct methods
.method public constructor <init>(LL7/i;Ljava/util/List;LL7/X;)V
    .locals 1

    .line 1
    const-string v0, "classifierDescriptor"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "arguments"

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
    iput-object p1, p0, LL7/X;->a:LL7/i;

    .line 15
    .line 16
    iput-object p2, p0, LL7/X;->b:Ljava/util/List;

    .line 17
    .line 18
    iput-object p3, p0, LL7/X;->c:LL7/X;

    .line 19
    .line 20
    return-void
.end method


# virtual methods
.method public final a()Ljava/util/List;
    .locals 1

    .line 1
    iget-object v0, p0, LL7/X;->b:Ljava/util/List;

    .line 2
    .line 3
    return-object v0
.end method

.method public final b()LL7/i;
    .locals 1

    .line 1
    iget-object v0, p0, LL7/X;->a:LL7/i;

    .line 2
    .line 3
    return-object v0
.end method

.method public final c()LL7/X;
    .locals 1

    .line 1
    iget-object v0, p0, LL7/X;->c:LL7/X;

    .line 2
    .line 3
    return-object v0
.end method
