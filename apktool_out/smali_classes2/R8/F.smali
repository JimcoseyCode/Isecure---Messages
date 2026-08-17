.class public final synthetic LR8/F;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic g:Lkotlin/jvm/internal/C;

.field public final synthetic h:Z


# direct methods
.method public synthetic constructor <init>(Lkotlin/jvm/internal/C;Z)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, LR8/F;->g:Lkotlin/jvm/internal/C;

    .line 5
    .line 6
    iput-boolean p2, p0, LR8/F;->h:Z

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    iget-object v0, p0, LR8/F;->g:Lkotlin/jvm/internal/C;

    .line 2
    .line 3
    iget-boolean v1, p0, LR8/F;->h:Z

    .line 4
    .line 5
    check-cast p1, Ln7/j;

    .line 6
    .line 7
    check-cast p2, Ln7/j$b;

    .line 8
    .line 9
    invoke-static {v0, v1, p1, p2}, LR8/H;->a(Lkotlin/jvm/internal/C;ZLn7/j;Ln7/j$b;)Ln7/j;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    return-object p1
.end method
