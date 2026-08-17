.class public final LQ7/k;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LQ7/k$a;
    }
.end annotation


# static fields
.field public static final c:LQ7/k$a;


# instance fields
.field private final a:Ly8/n;

.field private final b:LQ7/a;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, LQ7/k$a;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, LQ7/k$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 5
    .line 6
    .line 7
    sput-object v0, LQ7/k;->c:LQ7/k$a;

    .line 8
    .line 9
    return-void
.end method

.method private constructor <init>(Ly8/n;LQ7/a;)V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, LQ7/k;->a:Ly8/n;

    .line 4
    iput-object p2, p0, LQ7/k;->b:LQ7/a;

    return-void
.end method

.method public synthetic constructor <init>(Ly8/n;LQ7/a;Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, LQ7/k;-><init>(Ly8/n;LQ7/a;)V

    return-void
.end method


# virtual methods
.method public final a()Ly8/n;
    .locals 1

    .line 1
    iget-object v0, p0, LQ7/k;->a:Ly8/n;

    .line 2
    .line 3
    return-object v0
.end method

.method public final b()LL7/H;
    .locals 1

    .line 1
    iget-object v0, p0, LQ7/k;->a:Ly8/n;

    .line 2
    .line 3
    invoke-virtual {v0}, Ly8/n;->q()LL7/H;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method public final c()LQ7/a;
    .locals 1

    .line 1
    iget-object v0, p0, LQ7/k;->b:LQ7/a;

    .line 2
    .line 3
    return-object v0
.end method
