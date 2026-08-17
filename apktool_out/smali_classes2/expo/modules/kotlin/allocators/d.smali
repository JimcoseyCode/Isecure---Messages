.class public final synthetic Lexpo/modules/kotlin/allocators/d;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"

# interfaces
.implements Lexpo/modules/kotlin/allocators/UnsafeAllocator;


# instance fields
.field public final synthetic a:Ljava/lang/reflect/Method;

.field public final synthetic b:Ljava/lang/Class;

.field public final synthetic c:I


# direct methods
.method public synthetic constructor <init>(Ljava/lang/reflect/Method;Ljava/lang/Class;I)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lexpo/modules/kotlin/allocators/d;->a:Ljava/lang/reflect/Method;

    .line 5
    .line 6
    iput-object p2, p0, Lexpo/modules/kotlin/allocators/d;->b:Ljava/lang/Class;

    .line 7
    .line 8
    iput p3, p0, Lexpo/modules/kotlin/allocators/d;->c:I

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final newInstance()Ljava/lang/Object;
    .locals 3

    .line 1
    iget-object v0, p0, Lexpo/modules/kotlin/allocators/d;->a:Ljava/lang/reflect/Method;

    .line 2
    .line 3
    iget-object v1, p0, Lexpo/modules/kotlin/allocators/d;->b:Ljava/lang/Class;

    .line 4
    .line 5
    iget v2, p0, Lexpo/modules/kotlin/allocators/d;->c:I

    .line 6
    .line 7
    invoke-static {v0, v1, v2}, Lexpo/modules/kotlin/allocators/UnsafeAllocator$Companion;->a(Ljava/lang/reflect/Method;Ljava/lang/Class;I)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    return-object v0
.end method
