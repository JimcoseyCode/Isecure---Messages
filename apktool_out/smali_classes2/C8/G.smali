.class public abstract LC8/G;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"


# instance fields
.field private final a:LC8/I0;

.field private final b:Ljava/util/Set;

.field private final c:LC8/d0;


# direct methods
.method public constructor <init>(LC8/I0;Ljava/util/Set;LC8/d0;)V
    .locals 1

    .line 1
    const-string v0, "howThisTypeIsUsed"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object p1, p0, LC8/G;->a:LC8/I0;

    .line 10
    .line 11
    iput-object p2, p0, LC8/G;->b:Ljava/util/Set;

    .line 12
    .line 13
    iput-object p3, p0, LC8/G;->c:LC8/d0;

    .line 14
    .line 15
    return-void
.end method


# virtual methods
.method public abstract a()LC8/d0;
.end method

.method public abstract b()LC8/I0;
.end method

.method public abstract c()Ljava/util/Set;
.end method

.method public abstract d(LL7/m0;)LC8/G;
.end method

.method public abstract hashCode()I
.end method
