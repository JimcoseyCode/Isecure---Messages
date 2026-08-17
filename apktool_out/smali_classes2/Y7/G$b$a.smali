.class public final LY7/G$b$a;
.super LY7/G$b;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LY7/G$b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# instance fields
.field private final a:LL7/e;


# direct methods
.method public constructor <init>(LL7/e;)V
    .locals 1

    .line 1
    const-string v0, "descriptor"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const/4 v0, 0x0

    .line 7
    invoke-direct {p0, v0}, LY7/G$b;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 8
    .line 9
    .line 10
    iput-object p1, p0, LY7/G$b$a;->a:LL7/e;

    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public final a()LL7/e;
    .locals 1

    .line 1
    iget-object v0, p0, LY7/G$b$a;->a:LL7/e;

    .line 2
    .line 3
    return-object v0
.end method
