.class public final synthetic Ln7/c;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic g:[Ln7/j;

.field public final synthetic h:Lkotlin/jvm/internal/A;


# direct methods
.method public synthetic constructor <init>([Ln7/j;Lkotlin/jvm/internal/A;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Ln7/c;->g:[Ln7/j;

    .line 5
    .line 6
    iput-object p2, p0, Ln7/c;->h:Lkotlin/jvm/internal/A;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    iget-object v0, p0, Ln7/c;->g:[Ln7/j;

    .line 2
    .line 3
    iget-object v1, p0, Ln7/c;->h:Lkotlin/jvm/internal/A;

    .line 4
    .line 5
    check-cast p1, Li7/B;

    .line 6
    .line 7
    check-cast p2, Ln7/j$b;

    .line 8
    .line 9
    invoke-static {v0, v1, p1, p2}, Ln7/e;->b([Ln7/j;Lkotlin/jvm/internal/A;Li7/B;Ln7/j$b;)Li7/B;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    return-object p1
.end method
