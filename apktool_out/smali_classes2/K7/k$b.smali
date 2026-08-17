.class public final LK7/k$b;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LK7/k;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation


# instance fields
.field private final a:LL7/H;

.field private final b:Z


# direct methods
.method public constructor <init>(LL7/H;Z)V
    .locals 1

    .line 1
    const-string v0, "ownerModuleDescriptor"

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
    iput-object p1, p0, LK7/k$b;->a:LL7/H;

    .line 10
    .line 11
    iput-boolean p2, p0, LK7/k$b;->b:Z

    .line 12
    .line 13
    return-void
.end method


# virtual methods
.method public final a()LL7/H;
    .locals 1

    .line 1
    iget-object v0, p0, LK7/k$b;->a:LL7/H;

    .line 2
    .line 3
    return-object v0
.end method

.method public final b()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, LK7/k$b;->b:Z

    .line 2
    .line 3
    return v0
.end method
