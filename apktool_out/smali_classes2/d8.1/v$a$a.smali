.class public final Ld8/v$a$a;
.super Ld8/v$a;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ld8/v$a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# instance fields
.field private final a:Ld8/x;

.field private final b:[B


# direct methods
.method public constructor <init>(Ld8/x;[B)V
    .locals 1

    const-string v0, "kotlinJvmBinaryClass"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    .line 1
    invoke-direct {p0, v0}, Ld8/v$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    iput-object p1, p0, Ld8/v$a$a;->a:Ld8/x;

    iput-object p2, p0, Ld8/v$a$a;->b:[B

    return-void
.end method

.method public synthetic constructor <init>(Ld8/x;[BILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_0

    const/4 p2, 0x0

    .line 2
    :cond_0
    invoke-direct {p0, p1, p2}, Ld8/v$a$a;-><init>(Ld8/x;[B)V

    return-void
.end method


# virtual methods
.method public final b()Ld8/x;
    .locals 1

    .line 1
    iget-object v0, p0, Ld8/v$a$a;->a:Ld8/x;

    .line 2
    .line 3
    return-object v0
.end method
