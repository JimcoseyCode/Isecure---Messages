.class LO7/y$b;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LO7/y;->w0()LL7/r0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic g:LO7/y;


# direct methods
.method constructor <init>(LO7/y;)V
    .locals 0

    .line 1
    iput-object p1, p0, LO7/y$b;->g:LO7/y;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public a(LC8/d0;)LC8/d0;
    .locals 1

    .line 1
    iget-object v0, p0, LO7/y$b;->g:LO7/y;

    .line 2
    .line 3
    invoke-static {v0, p1}, LO7/y;->C0(LO7/y;LC8/d0;)LC8/d0;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, LC8/d0;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, LO7/y$b;->a(LC8/d0;)LC8/d0;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    return-object p1
.end method
